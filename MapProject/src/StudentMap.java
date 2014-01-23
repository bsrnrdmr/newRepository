/**
* Defines methods for a container class like a map, which is not generic,
* contains objects of Student in a tree structure, using their Integer IDs as key.
*
*/
public interface StudentMap {
/**
* Adds a student with key: id
* @param id key
* @param s value
*/
public void add(int id, Student s);
/**
* gives a student given its ID
* @param id key
* @return value
*/
public Student get(int id);
/**
* breadth-first traverse the tree and write the names of each student
*/
public void BFT();
}
