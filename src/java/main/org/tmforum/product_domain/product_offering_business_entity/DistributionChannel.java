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
* A distribution channel is the organization or entity by which a produc 
* t catalog is presented to a customer. 
 @since SID_R16.5
*/ 

public  class DistributionChannel  {



/**  
* Field ID
* A unique identifier for the DistributionChannel. 

*/
protected String ID ;




/**  
* Field name
* The name of the DistributionChannel. 

*/
protected String name ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;


}