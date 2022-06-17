#include <windows.h> 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <math.h> 
#include <GL/gl.h>
#include <GL/glut.h>
#define PI 3.14 // CODE BY YOGI 191110236 // MEMBUAT KERUCUT DENGAN ALAS

GLint circle_points = 30;

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
		glVertex3f(radius*cos(theta),0,radius*sin(theta));
		glEnd();
	}
}

void MyCircle(GLfloat radius1, GLfloat radius2){
	GLint i;
	GLdouble theta, ntheta;
	for (i = 0;i < circle_points;i++){
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+1)/circle_points);
		glVertex3f(0,0,0);
		glVertex3f(radius1*cos(theta),0,radius1*sin(theta));
		glVertex3f(radius1*cos(ntheta),0,radius1*sin(ntheta));
		glVertex3f(radius1*cos(theta),0,radius1*sin(theta));
		glEnd();
	}
}

static void Display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1,1,1);
	MyCone(1,1.5);
	MyCircle(1,0.5);
	glFlush();
}

void reshape (int w, int h){
	glViewport(0,0, (GLsizei)w, (GLsizei) h);
	glMatrixMode(GL_PROJECTION);
	glFrustum(-(GLfloat)w/h,(GLfloat)w/h,-1,1,1,20);
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
	glutCreateWindow("Kerucut Yogi");
	init();
	glutDisplayFunc(Display);
	glutReshapeFunc(reshape);
	glutMainLoop();
}
