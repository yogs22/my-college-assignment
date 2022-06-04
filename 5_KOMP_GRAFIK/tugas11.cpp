#include <windows.h> 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <math.h> 
#include <GL/gl.h>
#include <GL/glut.h>
#define PI 3.14 // CODE BY YOGI 191110236 // MEMBUAT RUMAH BURUNG

GLint circle_points = 30;

void MyTube(GLfloat radius, GLfloat tinggi) {
	GLint i;
	GLdouble theta, ntheta;
	for (i = 0;i < circle_points;i++) {
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+2)/circle_points);
		glVertex3f(radius*cos(theta),0,radius*sin(theta));
		glVertex3f(radius*cos(ntheta),0,radius*sin(ntheta));
		glVertex3f(radius*cos(ntheta),tinggi,radius*sin(ntheta));
		glVertex3f(radius*cos(theta),tinggi,radius*sin(theta));
		glVertex3f(radius*cos(theta),0,radius*sin(theta));
		glEnd();
	}
}

void MyCone(GLfloat radius, GLfloat tinggi) {
	GLint i;
	GLdouble theta, ntheta;
	for	(i = 0;i < circle_points;i++) {
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+1)/circle_points);
		glVertex3f(radius*cos(theta),0,radius*sin(theta));
		glVertex3f(0,tinggi,0);
		glVertex3f(radius*cos(ntheta),0,radius*sin(ntheta));
		glEnd();
	}
}

static void Display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1,1,1);
	MyTube(0.5,-0.5);
	MyCone(0.5,0.6);
	glFlush();
}

void reshape (int w, int h){
	glViewport(0,0, (GLsizei)w, (GLsizei) h);
	glMatrixMode(GL_PROJECTION);
	glFrustum(-0.5*(GLfloat)w/h,0.5*(GLfloat)w/h, -0.5,0.5,1,50);
	gluLookAt(0,0.5,3,0,0,-100,0,3,0);
}

void init(void) {
	glClearColor(0,0,0,0);
	glPolygonMode(GL_FRONT, GL_LINE);
	glPolygonMode(GL_BACK, GL_LINE);
}

int main(int argc, char* argv[]) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(350, 230);
	glutCreateWindow("Rumahnya Yogi");
	init();
	glutDisplayFunc(Display);
	glutReshapeFunc(reshape);
	glutMainLoop();
}
