int from99 = 99;
for(int i = 0; i<100;i++){
   if(i == 99){
     System.out.println("No bottles of beer on the wall! No bottles of beer!");
     System.out.println("Go to the store and buy some more. 99 bottles of beer on the wall!");
  }else{
  System.out.println(from99 + " bottles of beer on the wall, "+ from99+" bottles of beer.");
  from99 -= 1;
  System.out.println("Take one down, pass it around, " + from99 + " bottles of beer on the wall.");
  }
}
