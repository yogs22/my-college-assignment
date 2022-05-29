#include <windows.h> 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h>
#include <stdarg.h> 
#include <GL/gl.h>
#include <GL/glut.h> // CODE BY YOGI PRASETYAWAN 191110236
  
 void init(void)
{
   glClearColor (0.0, 0.0, 0.0, 0.0);
   glShadeModel (GL_POLYGON);
}
void display(void)
{
   glClear (GL_COLOR_BUFFER_BIT);
   glColor3f (1.0, 1.0, 1.0);
   glLoadIdentity ();
   gluLookAt (0.5, 2.0, 5.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
   glScalef (2.0, 2.0, 2.0);
   glutSolidCube(1);
   glFlush ();
}
void reshape (int w, int h)
{
   glViewport (0, 0, (GLsizei) w, (GLsizei) h);
   glMatrixMode (GL_PROJECTION);
   glLoadIdentity ();
   glFrustum (-0.5*(GLfloat)w/h,0.5*(GLfloat)w/h, -0.5,0.5, 1., 20.0);
   glMatrixMode (GL_MODELVIEW);
}
int main(int argc, char** argv)
{
   glutInit(&argc, argv);
   glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
   glutInitWindowSize (500, 500);
   glutCreateWindow (argv[0]);
   init ();
   glutDisplayFunc(display);
   glutReshapeFunc(reshape);
   glutMainLoop();
   return 0;
}
