class And{
public static void main(String[] as){
int a1 = 100;
short a2 = 150;
int a3 = 350;
long a4 = 200;
int res = (int)(a1++ - ++a2 + a3++ - ++a4);

System.out.println(res);
}}