/**
* Pricing Logic Algorithm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_T.r5BABP5E.d-O57.wBCB.zL.fA-content.html">Pricing Logic Algorithm ABE</a> 
* The PricingLogicAlgorithm ABE contains entities representing an instan 
* tiation of an interface specification to external rating function (wit 
* hout a modeled bahavior in SID). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_business_entity ;

/**
* Holds the value of a single index into a dimension of MatrixCharValue. 
*   
 @since SID_R16.5
*/ 

public  class MatrixCharValueIndex  {



/**  
* Field matrixcharvalue
*/
protected MatrixCharValue matrixcharvalue ;




/**  
* Field matrixCellCharValue
*/
protected MatrixCellCharValue matrixCellCharValue ;




/**  
* Field productCharacteristicValue
*/
protected ProductCharacteristicValue productCharacteristicValue ;




/**  
* Field characteristicValue
*/
protected CharacteristicValue characteristicValue ;




/**  
* Field seqNum
* Holds the sequentialnumber of the dimension that this index applies to 

*   

*/
protected Integer seqNum ;


}