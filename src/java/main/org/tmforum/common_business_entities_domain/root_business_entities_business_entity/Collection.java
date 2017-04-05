/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

/**
* This is an abstract base class for objects that represent collections  
* of ManagedEntity objects. This enables common attributes and relations 
* hips and other semantics to be applied to different types of Collectio 
* ns of ManagedEntity objects. These can then be refined in the subclass 
* es of Collection. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class Collection extends RootEntity {



/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;




/**  
* Field orderMethod
* This is an enumerated integer, and is used to define the method by whi 

* ch elements in an OrderedSet or Sequence are collated. If the Collecti 

* on type is Set or Bag, then this attribute MUST have the value 1 ("Not 

*  Applicable"). Values include:</br></br> 1: Not Applicable</br> 2: Asc 

* ending</br> 3: Descending</br> 

*/
protected Integer orderMethod ;




/**  
* Field type
* This is an enumerated integer that defines the type of Collection that 

*  this object is. Values include:</br></br> 1: Set</br> 2: OrderedSet</ 

* br> 3: Sequence</br> 4: Bag</br></br>A Set does not contain duplicate  

* elements, and does not impose an order on its elements. An OrderedSet  

* is like a Set, except that it does impose an order on its contents. A  

* Bag is like a Set, except that it may contain duplicates. A Sequence i 

* s like a Bag, except that the elements are ordered.</br> 

*/
protected Integer type ;


}