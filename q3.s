Integer  Procedure  Sigma (k,m,n,u);
    Name k,u;
    Integer k,m,n, u;
Begin
    Integer s;
    k := m;
    While k  <= n Do Begin s := s + u; k := k + 1; End;
    Sigma  := s;
End;

Integer Z;
Integer i;
Z :=  Sigma (i,1,4,i**2);