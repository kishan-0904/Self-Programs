//without changing positions

#include<stdio.h>
int main()
{
    int i,j,temp,num,arr[100];
    printf("Enter length of array:");
    scanf("%d",&num);
    printf("\nEnter elements:\n");
    for(i=0;i<num;i++)
        scanf("%d",&arr[i]);
    for(i=1;i<num;i++)
    {
        temp=arr[i];
        if(temp>=0)
            continue;
        j=i-1;
        while(j>=0 && arr[j] > 0)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]= temp;
    }

    printf("\nArranged Numbers with their positions altered:\n");
    for(i=0; i<num; i++)
        printf("%d ", arr[i]);
    printf("\n");
    return 0;  
}




//Changing positions while arranging


/*int main()
{
    int i,j,temp,num,arr[100];
    printf("Enter length of array:");
    scanf("%d",&num);
    printf("\nEnter elements:\n");
    for(i=0;i<num;i++)
        scanf("%d",&arr[i]);
    
    for ( i = 0; i < num; i++)
    {
        for(j=i+1; j<num; j++)
        {
            if(arr[i] > arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }

    printf("\nArranged Numbers with their positions altered:\n");
    for(i=0; i<num; i++)
        printf("%d ", arr[i]);
    printf("\n");
    return 0;  
}*/