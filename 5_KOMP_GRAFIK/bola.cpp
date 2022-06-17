#include <windows.h> 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <math.h> 
#include <GL/gl.h>
#include <GL/glut.h>
#define PI 3.14

void Bola(GLfloat radius)
{
	GLdouble inc = PI/12;
	GLdouble theta,phi;
	
	for (theta = -PI/2;theta<(PI/2-inc);theta+=inc){
		for (phi = 0; phi < 2*PI;phi+=inc) {
			glBegin(GL_POLYGON);
				glVertex3f(radius*cos(theta)*cos(phi),radius*sin(theta),radius*cos(theta)*sin(phi));
				glVertex3f(radius*cos(theta+inc)*cos(phi),radius*sin(theta+inc),radius*cos(theta+inc)*sin(phi));
				glVertex3f(radius*cos(theta+inc)*cos(phi+inc),radius*sin(theta+inc),radius*cos(theta+inc)*sin(phi+inc));
				glVertex3f(radius*cos(theta)*cos(phi+inc),radius*sin(theta),radius*cos(theta)*sin(phi+inc));
			glEnd();
		}
	}
	glFlush();
}

static void Display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glTranslatef(0.,0.,-0.5);
	Bola(1.5);
}

void reshape (int w, int h){
	glViewport(0,0, (GLsizei)w, (GLsizei) h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glFrustum(-(GLfloat)w/h,(GLfloat)w/h, -2,2,1,20);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	gluLookAt(0,2,2,0,0,-100,0,1,0);
}

void init(void) {
	glClearColor(0,0,0,0);
	glPolygonMode(GL_FRONT, GL_LINE);
	glPolygonMode(GL_BACK, GL_LINE);
}

int main(int argc, char* argv[]) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(320, 200);
	glutCreateWindow("Bola");
	init();
	glutDisplayFunc(Display);
	glutReshapeFunc(reshape);
	glutMainLoop();
}
