/**
* Characteristic Pricing ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_F.lA.pEO.rVE.d-.qM.vG.jM6.f.x.w.w-content.html">Characteristic Pricing ABE</a> 
* Enables pricing to be based on a combination of CharacteristicSpecifca 
* tions and their related CharacteristicSpecValues. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_abe.characteristic_pricing_business_entity ;

/**
* An element of a rule defined by a EntitySpecValueUse used to determine 
*  a ComponentProdOfferPrice. 
 @since SID_R16.5
*/ 

public  class CharPriceDepMember  {



/**  
* Field sequence
* The order in which a member appears in a expression (ConfigurationSpec 

* Constraint). 

*/
protected Integer sequence ;




/**  
* Field operator
* A mathematical symbol, term, or other entity that describes an operati 

* on. 

*/
protected String operator ;




/**  
* Field delimiter
* A character used to specify the boundary between separate members. 

*/
protected String delimiter ;




/**  
* Field characteristicPriceDependency
*/
protected CharacteristicPriceDependency characteristicPriceDependency ;




/**  
* Field entitySpecCharValueUse
*/
protected EntitySpecCharValueUse entitySpecCharValueUse ;


}