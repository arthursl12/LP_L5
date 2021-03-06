#include  <stdio.h>

int x=0;

void p(int& ,int& );

int main(){
    int x = 1;
    p(x,x);
    return 0;
}

void p(int &y, int &z){
    x = x+1;
    y = y+1;
    printf("y=%d, z=%d\n",y,z);
    z = z+1;
    printf("y=%d, z=%d\n",y,z);
    printf("%d: %d+%d+%d\n",x+y+z, x, y, z);
}