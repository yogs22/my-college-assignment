#include <windows.h> 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <math.h> 
#include <GL/gl.h>
#include <GL/glut.h>
#define PI 3.14

GLint circle_points = 30;

void Lingkaran(GLfloat px, GLfloat py, GLfloat pz, GLfloat r) {
	GLint i;
	GLdouble sudut;
	glBegin(GL_LINE_STRIP);
	for (i = 0;i < circle_points;i++) {
		sudut = 2*PI*i/circle_points;
		glColor3f(1,1,1);
		glVertex3f(px+r*cos(sudut),py,pz+r*sin(sudut));
	}
	glEnd();
}

void Botol(GLfloat radius1, GLfloat radius2, GLfloat radius3) {
	GLint i;
	GLdouble theta, ntheta;
	for (i = 0;i < circle_points; i++) {
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+1)/circle_points);
		glVertex3f(0,0,0);
		glVertex3f(radius1*cos(theta),0,radius1*sin(theta));
		glVertex3f(radius1*cos(ntheta),0,radius1*sin(ntheta));
		glVertex3f(radius1*cos(ntheta),2,radius1*sin(ntheta));
		glVertex3f(radius2*cos(ntheta),3,radius2*sin(ntheta));
		glVertex3f(radius2*cos(ntheta),4,radius2*sin(ntheta));
		glVertex3f(radius2*cos(theta),4,radius2*sin(theta));
		glVertex3f(radius2*cos(theta),3,radius2*sin(theta));
		glVertex3f(radius1*cos(theta),2,radius1*sin(theta));
		glVertex3f(radius1*cos(theta),0,radius1*sin(theta));
		glEnd();
	}
}

void Lamp(GLfloat radius1, GLfloat radius2, GLfloat radius3) {
	GLint i;
	GLdouble theta, ntheta;
	for (i = 0;i < circle_points; i++) {
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+1)/circle_points);
		glVertex3f(0,5,0);
		glVertex3f(radius3*cos(ntheta),4,radius3*sin(ntheta));
		glVertex3f(radius3*cos(theta),4,radius3*sin(theta));
		glVertex3f(radius2*cos(ntheta),5.5,radius2*sin(ntheta));
		glVertex3f(radius2*cos(theta),5.5,radius2*sin(theta));
		glEnd();
	}
}

void Tutup(GLfloat radius1, GLfloat radius2, GLfloat radius3) {
	GLint i;
	GLdouble theta, ntheta;
	for (i = 0;i < circle_points; i++) {
		glBegin(GL_POLYGON);
		theta = (2*PI*i/circle_points);
		ntheta = (2*PI*(i+1)/circle_points);
		glVertex3f(0,4,0);
		glVertex3f(radius3*cos(ntheta),4,radius3*sin(ntheta));
		glVertex3f(radius3*cos(theta),4,radius3*sin(theta));
		glEnd();
	}
}

void Display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1,1,1);
	Botol(0.8,0.3,2);
	Lingkaran(0,0,0,0.8);
	Lingkaran(0,2,0,0.8);
	Lingkaran(0,3,0,0.3);
	Lingkaran(0,4,0,1.7);
	Lingkaran(0,5.5,0,0.5);
	Lamp(1,1,1.7);
	Tutup(1,1,1.7);
	glFlush();
}

void reshape (int w, int h){
	glViewport(0,0, (GLsizei)w, (GLsizei) h);
	glMatrixMode(GL_PROJECTION);
	glFrustum(-(GLfloat)w/h,(GLfloat)w/h,-1,1,1,20);
	gluLookAt(0,2.8,4.8,0,0,-100,0,2,0);
}

void init(void) {
	glClearColor(0,0,0,0);
	glLineWidth(1.5);
	glPolygonMode(GL_FRONT, GL_FILL);
	glPolygonMode(GL_BACK, GL_FILL);
}

int main(int argc, char* argv[]) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(400, 350);
	glutCreateWindow("Lampu UAS Yogi");
	init();
	glutDisplayFunc(Display);
	glutReshapeFunc(reshape);
	glutMainLoop();
}
