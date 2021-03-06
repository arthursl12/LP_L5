#include <stdio.h>
#define MIN(X, Y) ((X) < (Y) ? (X) : (Y))

int x = 0;
int z = 0;

int f(){
    x += 1;
    return 10;
}

int g(){
    z += 1;
    return 5;
}

int main(){
    int res = MIN(f(), g());
    printf("Min: %d, x=%d, z=%d\n", res, x, z);
}