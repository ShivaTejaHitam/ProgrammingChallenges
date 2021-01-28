#include<iostream>
using namespace std;

int main()
{
    int t;
    int n,i;
    int myscore=0;
    cin>>t;
    for(i=0;i<t;i++)
    {
        cin>>n;
        myscore=0;
        while(n>0)
        {
            if(n%2==0)
            {
                myscore=myscore+(n/2);
                n/=2;
            }
            else if(n%2==1)
            {
                myscore++;
                n--;
            }

            if(n%2==0)
            {
                n/=2;
            }
            else
            {
                n--;
            }

        }

        cout<<myscore;

    }
    return 0;
}
