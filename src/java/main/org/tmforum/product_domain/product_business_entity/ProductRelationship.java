/**
* Product ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA6D00A4-content.html">Product ABE</a> 
* Represents an instance of a product offering subscribed to by a party, 
*  such as a customer, the place where the product is in use, as well as 
*  configuration characteristics, such as assigned telephone numbers and 
*  internet addresses.  The Product ABE also tracks the services and/or  
* resources through which the product is realized. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_business_entity ;

/**
* A relationship between/among Products, such as  replacement, migration 
* , substitution, or dependency. 
 @since SID_R16.5
*/ 

public  class ProductRelationship  {



/**  
* Field product
*/
protected Product product ;




/**  
* Field product2
*/
protected Product product2 ;




/**  
* Field type
* A categorization of the relationship, such as relies on. 

*/
protected String type ;




/**  
* Field validFor
* The period for which the relationship is applicable. 

*/
protected TimePeriod validFor ;


}