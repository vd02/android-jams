fun main()
{
val a=5
val b=3
val c=4
if (a==b && b==c)
println("Equilateral Triangle")
else if (a==b || a==c || b==c)
println("Isosceles Triangle")
else if (a!=b && b!=c)
println("Scalene Triangle")
}
