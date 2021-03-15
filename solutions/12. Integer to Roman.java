     map.put(1,"I");
     map.put(5,"V");
     map.put(10,"X");
     map.put(50,"L");
    map.put(100,"C");
    map.put(500,"D");
    map.put(1000,"M");
    
    String roman="";
    while(num!=0 && num>0)
    {
        if(num>=1000)
        {
          num-=1000;
          roman+=map.get(1000);
        }
              else if(num>=500 && num<1000)
        {
            if(num<900)
            {
                num-=500;
                roman+=map.get(500);
            }
            else if(num>=900)
            {
                num-=900;
                roman+="C"+map.get(1000);
            }
        }
                 else if(num>=100 && num<500)
        {
         if(num<400)
         {
             num-=100;
             roman+=map.get(100);
         }
         else if(num>=400)
         {
             num-=400;
             roman+="C"+map.get(500);
