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
* Holds the list of scalar values of MarixCharacteristic. In addition it 
*  includes the indices of the dimansions of the matrix.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Characteristic ABE::CharacteristicValue @since SID_R16.5
*/ 

public  class MatrixCharValue extends CharacteristicValue {



/**  
* Field matrixCellCharValue
*/
protected List<MatrixCellCharValue> matrixCellCharValue ;




/**  
* Field matrixCharValueIndex
*/
protected MatrixCharValueIndex matrixCharValueIndex ;


}