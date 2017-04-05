/**
* Currency ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_MHI54IH.uE.eW.e1.q.f.pS.tFE.qA-content.html">Currency ABE</a> 
* Groups main entities within currency model. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.currency_business_entity ;

/**
* Measurement unit of a currency. For CurrencyUnitName Yuan associated t 
* o Chinese, rate =1, isStadUnit = True, isMinUnit = False. 
 @since SID_R16.5
*/ 

public  class CurrencyUnit  {



/**  
* Field ID
* A unique identifier for the currency unit. 

*/
protected String ID ;




/**  
* Field rate
* The rate between standard currency unit and non-standard currency unit 

* . 

*/
protected Integer rate ;




/**  
* Field isStdUnit
* A flag to indicate if it is standard unit of a currency. 

*/
protected Boolean isStdUnit ;




/**  
* Field isMinUnit
* A flag to indicate if it is minimum unit of a currency. 

*/
protected Boolean isMinUnit ;




/**  
* Field currency
*/
protected Currency currency ;




/**  
* Field currencyUnitName
*/
protected CurrencyUnitName currencyUnitName ;


}