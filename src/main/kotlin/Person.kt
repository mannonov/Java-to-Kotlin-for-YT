class Person {

    var fName: String? = null
        get() = "fZield"
        set(value) {
            if (value != ""){
                field = value
            }else{
                "fName"
            }
        }

//    fun getfName(): String {
//        return fName!!
//    }
//
//    fun setfName(fName: String) {
//        if (fName != "")
//            this.fName = fName
//        else this.fName = "fName"
//    }

    var lName: String? = null
    get() = field
    set(value) {
        field = value
    }

    constructor(fName: String, lName: String) {

        this.fName = fName
        this.lName = lName

    }

    constructor(fName: String) {
        this.fName = fName
    }

}