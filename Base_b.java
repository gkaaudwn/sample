
 import java.io.*;

class Base_b{
  public static void main(String args[])throws IOException{
   B_game b1 = new B_game();
   b1.num();
   b1.base_b();
  }
 }

class B_game{

 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  int com_pt[] = new int[4];
  int user[] = new int[4];
  int count;
  int strike, ball, out;
  char keep;

 int temp_count=0;  
  int temp;
  
  void num(){
   for(int i=0; i<com_pt.length-1; i++){
    while(true){
     temp = (int)(Math.random()*9)+1;
     temp_count = 0;
     for(int j=0; j<i; j++){
      if(temp == com_pt[j]){
       temp_count=1;
       break;
      }
     }
     if(temp_count==0){
      com_pt[i] = temp;
      break;
     }
    }
 //   System.out.println(" "+com_pt[i]+" ");
   }
  }

 void base_b() throws IOException{
   
   for(int i=0; i<user.length-1; i++){
    System.out.print("숫자 입력: ");
    user[i] = Integer.parseInt(in.readLine());
   }
   System.out.println();

  for(int i=0; i<com_pt.length-1; i++){
    for(int j=0; j<user.length-1; j++){
     if(com_pt[i]==user[j]){
      if(i==j){
       strike++;
      }
      else if(i!=j){
       ball++;
      }
     }
    }
   }
   out=3-(strike+ball);
   
   if(strike==3){
    System.out.println("[ "+strike+" ] Strike [ "+ball+" ] Ball [ "+out+" ] Out");
    System.out.println(count+1+" 회만에 성공");
    strike=0;
    ball=0;
    out=0;
    count=0;
    
    num();
   }
   else{
    System.out.println("[ "+strike+" ] Strike [ "+ball+" ] Ball [ "+out+" ] Out");
    strike=0;
    ball=0;
    out=0;
    count++;
   }

  while(true){
    System.out.print("다시 하시겠습니까? Y/N: ");
    keep = (char)System.in.read();
    System.in.read();
    System.in.read();
    System.out.println();

 if(keep == 'y'|| keep=='Y'){
     base_b();
    }else if(keep == 'n'|| keep=='N'){
     System.exit(-1);
    }else{
     System.out.println("다시 입력하세요");
    }
   }
  }
 }

