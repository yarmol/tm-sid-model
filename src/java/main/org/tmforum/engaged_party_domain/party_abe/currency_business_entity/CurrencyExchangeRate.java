/**
* Currency ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_MHI54IH.uE.eW.e1.q.f.pS.tFE.qA-content.html">Currency ABE</a> 
* Groups main entities within currency model. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.currency_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;

/**
* Exchange rate between currencies. 
 @since SID_R16.5
*/ 

public  class CurrencyExchangeRate  {



/**  
* Field ID
* A unique identifier for the exchange rate. 

*/
protected String ID ;




/**  
* Field value
* Value of the exchange rate. 

*/
protected float value ;




/**  
* Field description
* An explanation of the CurrencyExchangeRate. 

*/
protected String description ;




/**  
* Field status
* Status of currency exchange rate, such as Normal, Discarded. 

*/
protected Boolean status ;




/**  
* Field validFor
* The period during which the CurrencyExchangeRate is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field currency
*/
protected Currency currency ;




/**  
* Field currency2
*/
protected Currency currency2 ;


}