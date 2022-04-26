#include <windows.h>
#include <math.h>
#include <gl/glut.h>
#define PI 3.1415926535898
// YOGI PRASETYAWAN HADI - 191110236
int jumlah_titik = 100;

void CircleBack(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(80+80*cos(sudut),80+80*sin(sudut));
    }
    glEnd();
}

void CircleBackEye(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(30+30*cos(sudut),30+30*sin(sudut));
    }
    glEnd();
}

void CircleEye(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(20+20*cos(sudut),20+20*sin(sudut));
    }
    glEnd();
}

void CircleEyeFront(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(12+12*cos(sudut),12+12*sin(sudut));
    }
    glEnd();
}


void Nose(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(10+10*cos(sudut),10+10*sin(sudut));
    }
    glEnd();
}

void Ear(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(15+15*cos(sudut),15+15*sin(sudut));
    }
    glEnd();
}

void EarFront(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(8+8*cos(sudut),8+8*sin(sudut));
    }
    glEnd();
}

void Foot(){
    GLint i;
    GLdouble sudut;
    glBegin(GL_POLYGON);
    for(i=0;i<jumlah_titik;i++){
        sudut = 2*PI*i/jumlah_titik;
        glVertex2f(15+15*cos(sudut),15+15*sin(sudut));
    }
    glEnd();
}

void Display(){
    glColor3f(0.5f, 0.33f, 0.05f);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(80,20,0);
    CircleBack();
    
    glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.5,0);
    glTranslatef(95,60,0);
    CircleBackEye();
    
    glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.5,0);
    glTranslatef(165,60,0);
    CircleBackEye();
    
    glColor3f(0.5f, 0.35f, 0.05f);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(175,85,0);
    CircleEye();

	glColor3f(0.5f, 0.35f, 0.05f);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(105,85,0);
    CircleEye();
    
    glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(113,90,0);
    CircleEyeFront();
    
    glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(183,90,0);
    CircleEyeFront();
    
    glColor3f(1,0,0);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(150,50,0);
    Nose();
    
    glColor3f(0.5f, 0.35f, 0.05f);
    glLoadIdentity();
    glScalef(1.1,1,0);
    glTranslatef(187,170,0);
    Ear();
    
    glColor3f(0.5f, 0.35f, 0.05f);
    glLoadIdentity();
    glScalef(1.1,1,0);
    glTranslatef(70,170,0);
    Ear();
    
    glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(83,147,0);
    EarFront();

	glColor3f(0,0,0);
    glLoadIdentity();
    glScalef(1,1.2,0);
    glTranslatef(215,147,0);
    EarFront();
    
    glColor3f(0.5f, 0.20f, 0.05f);
    glLoadIdentity();
    glScalef(1.5,1,0);
    glTranslatef(108,11,0);
    Foot();
    
    glColor3f(0.5f, 0.20f, 0.05f);
    glLoadIdentity();
    glScalef(1.5,1,0);
    glTranslatef(78,11,0);
    Foot();
    
    glBegin(GL_LINE_STRIP);
    glColor3f(0,0,0);
    glVertex2f(29.,50.);
    glVertex2f(29.,38.);
    glEnd();
    
    glBegin(GL_LINE_STRIP);
    glColor3f(0,0,0);
    glVertex2f(20.,38.);
    glVertex2f(38.,38.);
    glTranslatef(80,0,0);
    glEnd();
    
    glutSwapBuffers();
    glLoadIdentity();
    glEnd();
    glFlush();
}

void reshape(int w,int h){
    glViewport(0,0,(GLsizei)w,(GLsizei)h);
    glMatrixMode(GL_PROJECTION);
    gluOrtho2D(0,320,0,240);
    glMatrixMode(GL_MODELVIEW);
}

void init(void){
    glClearColor(0,0,0,0);
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);  
    glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
    glutInitWindowSize(480,300);
    glutCreateWindow("Membuat Gambar - UTS");
    init();
    glutDisplayFunc(Display);
    glutReshapeFunc(reshape);
    glutMainLoop();
}
