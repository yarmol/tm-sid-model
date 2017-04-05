/**
* Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C174B400CC-content.html">Usage ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_business_entity ;

/**
* An occurrence of employing a Product, Service, or Resource for its int 
* ended purpose, which is of a billing system's interest and can have ch 
* arges applied to it. It is comprised of characteristics, which represe 
* nt attributes of usage. 
 @since SID_R16.5
*/ 

public abstract class Usage  {



/**  
* Field usageDate
* The date the usage was created. 

*/
protected DateTime usageDate ;




/**  
* Field usageStatus
* The condition of the usage, such as new, processed. 

*/
protected Integer usageStatus ;




/**  
* Field usageSpecification
*/
protected UsageSpecification usageSpecification ;




/**  
* Field usageCharacteristicValue
*/
protected List<UsageCharacteristicValue> usageCharacteristicValue ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field usage
*/
protected List<Usage> usage ;




/**  
* Field usage1
*/
protected List<Usage> usage1 ;




/**  
* Field productPrice
*/
protected List<ProductPrice> productPrice ;




/**  
* Field usageRatingPLA
*/
protected UsageRatingPLA usageRatingPLA ;


}