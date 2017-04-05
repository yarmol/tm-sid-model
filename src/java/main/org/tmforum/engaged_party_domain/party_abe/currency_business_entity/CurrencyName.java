/**
* Currency ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_MHI54IH.uE.eW.e1.q.f.pS.tFE.qA-content.html">Currency ABE</a> 
* Groups main entities within currency model. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.currency_business_entity ;

/**
* Name of a currency. Under different  languages, a currency has differn 
* ent names,  e.g. Renminbi Yuan in English and 人民币元 in Chinese to expre 
* ss the same Chinese currency. 
 @since SID_R16.5
*/ 

public  class CurrencyName  {



/**  
* Field name
* Name of a currency under a language. 

*/
protected String name ;




/**  
* Field currency
*/
protected Currency currency ;




/**  
* Field language
*/
protected Language language ;


}