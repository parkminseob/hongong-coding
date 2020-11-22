#include <stdio.h>
#include <stdlib.h>
//자료구조_박민섭
#define MAX_LENGTH 100
 
int stack[MAX_LENGTH];
int last=-1;
 //자료구조_박민섭
int IsEmpty(){
    if(last<0)
        return true;
    else
        return false;
    }
//자료구조_박민섭
int IsFull(){
    if(last>=MAX_LENGTH-1)
        return true;
    else
        return false;
}
 //자료구조_박민섭
void push(int value){
    if(IsFull()==true)
        printf("스택이 가득 찼습니다.");
    else
        stack[++last]=value; 
}
 //자료구조_박민섭
int pop(){
    if(IsEmpty()==true)
        printf("스택이 비었습니다.");
    else 
        return stack[last--];
}
 //자료구조_박민섭
int main(){
    push(3);
    push(5);
    push(12);
    printf("%d ",pop());
    printf("%d ",pop());
    printf("%d ",pop());
    return 0;
}