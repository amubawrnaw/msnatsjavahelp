#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
	char input,fName[50],compile[50]="javac ",run[50]="java ",doc[50]="javadoc ";
	while(input!='\b')
	{
		input = 'p';
		printf("\n\t\tInput filename: ");
		scanf("%s",fName);
		strcat(compile,fName);
		strcat(compile,".java");
		strcat(run,fName);
		strcat(doc,fName);
		while(input!='x')
		{
			system("cls");
			printf("\n\t\tCurrent File Opened : %s",fName);
			printf("\n\n\t\tc - compile\n\n\t\tr - run\n\n\t\ta - compile n run\n\n\t\tx - choose new file\n\n\t\td - javadoc\n\n");
			input=getch();
			switch(input)
			{
				case 'c':system(compile);break;
				case 'a':system(compile);
				case 'r':system(run);break;
				case 'd':system(doc);
			}
			getch();
		}
		system("cls");
	}


}
