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
* A role a business entity (such as PartyRole, ResourceRole or CustomerA 
* ccount) plays in the relationship for a Product. For example: user, ow 
* ner, payer and so forth. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Users and Roles ABE::InvolvementRole @since SID_R16.5
*/ 

public  class ProductInvolvementRole extends InvolvementRole {



/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field productfinancialaccountrelationship
*/
protected List<ProductFinancialAccountRelationship> productfinancialaccountrelationship ;


}