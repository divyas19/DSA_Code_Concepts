searchInfinite(int a[], int key)
{
  int l =0;
  int h = 1;
  while(a[h]<key)
  {
    l= h;
    h = 2*h;
  }
  return binarySearch(a,key,l,h);
}

/*
If element is present at 1600

2^11 = 2048
       1600
2^10 = 1024

log(1600) = 10.

TC - log(i) - i is position where element is present.

So Total TC - log(n) + log(n) Binary Search

Total TC - O(log(n))
 */
