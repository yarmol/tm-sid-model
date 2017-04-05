/**
* Currency ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_MHI54IH.uE.eW.e1.q.f.pS.tFE.qA-content.html">Currency ABE</a> 
* Groups main entities within currency model. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.currency_business_entity ;

/**
* Represent the currency in reality. Currency uses 1 or more CurrencyUni 
* ts. For example, Currency(code=CNY, symbol= ￥) use three CurrencyUnits 
* (Yuan, Jiao, Fen).Currency is associated to CurrencyExchangeRate with  
* CurrencyUsedAsSource and CurrencyUsedAsDestination. Currency can be us 
* ed in different Countrys. 
 @since SID_R16.5
*/ 

public  class Currency  {



/**  
* Field code
* Represents the code of the currency in the usage for convenience. Gene 

* rally it is made up of three capital English letters, the first two of 

*  which represent the country and the last of which represents the name 

*  of the currency. For example, USD represents United State of America  

* Dollar. Usually ISO 4217 is used. 

*/
protected String code ;




/**  
* Field symbol
* Symbol of a currency, such as $. 

*/
protected String symbol ;




/**  
* Field partyRoleCurrency
*/
protected List<PartyRoleCurrency> partyRoleCurrency ;




/**  
* Field currencyExchangeRate
*/
protected List<CurrencyExchangeRate> currencyExchangeRate ;




/**  
* Field currencyExchangeRate2
*/
protected List<CurrencyExchangeRate> currencyExchangeRate2 ;




/**  
* Field currencyUnit
*/
protected CurrencyUnit currencyUnit ;




/**  
* Field currencyName
*/
protected CurrencyName currencyName ;




/**  
* Field country
*/
protected Country country ;


}