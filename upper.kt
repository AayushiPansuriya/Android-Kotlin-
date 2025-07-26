fun main()
{
 val input = "this <u> is</u> not a <u> garden</u>"
    print("Enter a string:")
    val a= input.split("<u>","</u>")

    for(i :Int in a.indices)
    {
        if(i%2==0){
            print(a[i])
        }
        else{
            print(a[i].uppercase())
        }
//        b[i].join()
    }
//    println("output:$b")
}

