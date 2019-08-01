class Maxi
{
  finalstatic int NO=256;
  static int max(String str,int n)
  {
    int count[]=new int[no];
    for(int i=0;i<n;i++)
    {
      count(str.charAt(i)]++;
            }
            int max=0;
            for(int i=0;i<NO;i++)
            {
              if(count[i]!=0)
              {
                max++;
              }
            }
            return max;
            static int small(String str)
            {
              int n=str.length();
              int max=max(str,n);
              int min=n;
              for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                {
                  String subs=null;
                  if(i<j)
                    subs=str.substring(i,j);
                  int subl=subs.length();
                  int sub=max(subs,subsl);
                  if(subsl<min && max==sub)
                  {
                    minl=subl;
                  }
                }
            }
            return minl;
            }
            static public void main(String[] args)
            {
              String str="KPRCOLL";
              int len=s(str);
              System.out.println(""+len);
            }
            }
            
          
               
                  

