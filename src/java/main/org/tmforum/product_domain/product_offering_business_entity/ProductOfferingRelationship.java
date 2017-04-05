/**
* Product Offering ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA620398-content.html">Product Offering ABE</a> 
* The Product Offering ABE describes tangible and intangible goods made  
* available for a certain price to the market in the form of product cat 
* alogs.  This ABE is also responsible for targeting market segments bas 
* ed on the appropriate market strategy. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_business_entity ;

/**
* A significant connection or similarity between two or more ProductOffe 
* rings. For example, the relationship between a provider's ProductOffer 
* ing and a supplier/partner's ProductOffering used to fulfill the provi 
* der's ProductOffering; a service provider offers various photos for do 
* wnload and printing...a print shop prints them for the provider and co 
* nsiders one photo (ProductOffering) the same as any other from a prici 
* ng perspective...one partners' photo offering is related to many of th 
* e provider's photos. 
 @since SID_R16.5
*/ 

public  class ProductOfferingRelationship  {



/**  
* Field type
* A categorization of the relationship, such as supplier/partner equival 

* ent, alternate, requires and so forth. 

*/
protected String type ;




/**  
* Field validFor
* The period during which the relationship is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field productOffering2
*/
protected ProductOffering productOffering2 ;


}