/**
* Characteristic Pricing ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_F.lA.pEO.rVE.d-.qM.vG.jM6.f.x.w.w-content.html">Characteristic Pricing ABE</a> 
* Enables pricing to be based on a combination of CharacteristicSpecifca 
* tions and their related CharacteristicSpecValues. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_abe.characteristic_pricing_business_entity ;

/**
* A group of EntitySpecValueUse entities that are used to deterimine a C 
* omponentProdOfferPrice. 
 @since SID_R16.5
*/ 

public  class CharacteristicPriceDependency  {



/**  
* Field name
* A word, term, or phrase by which the entity is known and distinguished 

*  from other entities. 

*/
protected String name ;




/**  
* Field validFor
* The period of time for which the entity is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field componentProdOfferPrice
*/
protected ComponentProdOfferPrice componentProdOfferPrice ;




/**  
* Field charPriceDepMember
*/
protected List<CharPriceDepMember> charPriceDepMember ;


}