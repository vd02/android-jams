fun main()
{
val n=55
if (n%5==0)
{
if (n%11==0)
{
println("Divisible by 5 and 11 both")
}
else
{
println("Divisble by only 5")
}
}
else
{
if(n%11==0)
    {println("Divisble by only 11")}
else
    {println("Not divisble by either 5 or 11")}
}
}
