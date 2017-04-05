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
* A condition under which a ProductOffering is made available to Custome 
* rs. ProductOfferingTerm include ProductOfferingFinancialTerm, which in 
* cludes such things as acceptable methods of payment, ShipmentTerm, and 
*  ServiceTerm. 
 @since SID_R16.5
*/ 

public  class ProductOfferingTerm  {



/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field agreementTermOrCondition
*/
protected List<AgreementTermOrCondition> agreementTermOrCondition ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;


}