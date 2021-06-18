#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<stdlib.h>

struct linklist
{
    int num;
    struct linklist *next;
}
struct linklist *start;

void display();

//For insert
void insert();
void atbeg();
void atend();
void atbefore();
void after();
void atpos();
void count();
void edit();
void reverse();
void sort();


//For delete
void del();
void atbeg1();
void atend1();
void atbefore1();
void atafter1();
void atnode();

int main()
{
    int ch1;
    char choice1 = 'y';
    start = NULL;
    system("cls");

    do
    {
        printf("\n1. INSERT");
        printf("\n2. DISPLAY");
        printf("\n3. DELETE");
        printf("\n4. COUNT NODES");
        printf("\n 5. EDIT");
		printf("\n 6. REVERSE  ");
		printf("\n 7. SORT   ");
		printf("\n 8. EXIT      ");
		printf("\n\n Enter Your Choice = ");
		scanf("%d",&ch1);

		switch (ch1)
		{
			case 1:
				insert ( );
				break;

			case 2:
				display ( );
				break;
			
			case 3:
				del ( );
				break;
			
			case 4:
				count( );
				break;
			
			case 5:
				edit ( );
				break;
			
			case 6:
				reverse ( );
				break;
			
			case 7:
				sort ();
				break;
			
			case 8:
				choice1='n';
				break;
			
			default:
				printf ("invalid choice");
		}
	} while (choice1== 'y');
	return 0;
}	// end of main //

