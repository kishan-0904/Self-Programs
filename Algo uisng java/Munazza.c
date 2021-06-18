#include<stdio.h>
int main()
{
    int m1,m2,m3,m4,m5;
    double perc;
    char grade;
    printf("Enter the salary :");
    scanf("%d %d %d %d %d",&m1, &m2, &m3, &m4, &m5);
    perc = (m1+m2+m3+m4+m5) / 5;
    if(perc >= 90)
        grade = 'A';
    else if(perc >= 80)
        grade = 'B';
    else if(perc >= 70)
        grade = 'C';
    else if(perc >= 60)
        grade = 'D';
    else if(perc >= 40)
        grade = 'E';
    else
        grade = 'F';
    //grossSalary = basicSalary + hra + da;
    printf("\nGross Salary = %c ", grade);
    return 0;
}