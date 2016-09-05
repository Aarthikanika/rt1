import java.io.*;
class longest()
{
  public static void main(String args[])
  {
public String longestCommonPrefix(String strs[])
{
if(strs==null||strs.length==0)
{
return"";
}
if(strs.length==1)
return strs[0];
int minlen=strs.length+1;
for(string str:strs)
{
if(minlen>str.length())
minlen=str.length();
}
}
for(int i=0;i<minlen;i++)
{
for(int j=0;j<strs.length-1;j++)
{
string s1=strs[j];
string s2=strs[j+1];
if(s1.charAt[i]=s2.charAt[i])
{
return s1.substring(0,i);
}
}
}
return strs[0].substring(0,minlen);
}
}
}
