//find the product Tea and Calculate the total for each.....

// product        sales21           sales22
//  tea             100              110
//  coffee          100              120
//  green tea       75               100


// -----------Solution-----------------
class Question2{
    public static void main(String[] args)  {
        int sum=0;
       String[][] prod={{"tea","100","110"},{"cofee","100","120"},{"green tea","75","100"}};
       for(int i=0;i<prod.length;i++){
        if(prod[i][0].toString().contains("tea")){
            sum=Integer.parseInt( prod[i][1])+Integer.parseInt( prod[i][2]);
            System.out.println(prod[i][0]+":"+sum);
        }
       }
    }
}




// ----------------output---------------
// tea:210
// green tea:175