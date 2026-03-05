/*
    This class will hold utility functions that I create to make life easier for myself during this project
 */
class Utility{
    //this function will take a generic type array and a generic type value and add it to the array through some fancy logic
    inline fun <reified T> addToArray(arrayToAddTo: Array<T>, elementToAddToArray: T): Array<T?> {
        //this value will hold how many spaces are actually needed in the array
        //by our logic the space is "not needed" if the value itself is null
        //this can create problems later however though with null values in a table
        var spacesNeeded = 0

        //first determine how many spaces are in fact needed in the array so we can just avoid any null space
        for (i in 0..<arrayToAddTo.size)
            if (arrayToAddTo[i] != null) spacesNeeded++

        //"resize" the array with space for the new element using the resizeArray function
        val newArrayWithAddedElement: Array<T?> = resizeArray(arrayToAddTo, spacesNeeded + 1)

        //copy old elements to the new array if it is not an "empty" element (null)
        for (i in 0..<arrayToAddTo.size)
            if(arrayToAddTo[i] != null) newArrayWithAddedElement[i] = arrayToAddTo[i]

        //add the new element at the end of the array
        newArrayWithAddedElement[spacesNeeded] = elementToAddToArray
        //return the new array
        return newArrayWithAddedElement
    }

    //this function will resize an array to a target length
    inline fun <reified T> resizeArray(arrayToResize: Array<T>, intendedSize: Int): Array<T?> {
        //our new resized array that we will be returning at the end
        val newResizedArray: Array<T?> = arrayOfNulls(intendedSize)

        //if the array is already the intended size we will just immediately return since it would be a waste of processing power to follow the steps
        if(arrayToResize.size == intendedSize)
            return arrayToResize as Array<T?>

        //copy the old array elements to the new one
        for (i in 0..<arrayToResize.size)
            newResizedArray[i] = arrayToResize[i]

        //since we created newResizedArray as an array of nulls we should be able to just return here as the new spaces will be null
        return newResizedArray
    }
}