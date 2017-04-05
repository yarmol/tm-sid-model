/**
* Software Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WU.i.pIG33E.eKS.yM.d.c.hR.z1.yQ-content.html">Software Resource Specification ABE</a> 
* The definition of an SoftwareResourceSpecification whose attribute val 
* ues are shared by every instance of an SoftwareResource related to it. 
*   This entity is a super-class for  
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_abe.software_resource_and_software_specifications_abe.software_resource_specification_business_entity ;

/**
* A generalization that represents all attributes and associations that  
* are common to the definition of a SoftwareSpecfification and APISpecif 
* ication. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SoftwareResourceSpecification extends LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field releaseStatus
* This attribute is an enumerated integer that defines the particualr re 

* lease status of this SoftwareResourceSpecification. Values include:</b 

* r></br> 0: alpha</br> 1. beta</br> 2: FCS (First Customer Shipment)</b 

* r> 3. GD (General Deployment)</br> 4: SV (Special Version for 1 or mor 

* e customers)</br> 5: EOE (end of engineering)</br> 6: EOS (end of sale 

* )</br> 7: EOL (end of life)</br> </br>FCS marks the beginning of the l 

* imited deployment phase. In this phase, the SoftwareResourceSpecificat 

* ion is usually certified on a few platforms but not all platforms.</br 

* ></br>GD marks the certification of stable SoftwareResourceSpecificati 

* on on all major platforms.</br></br>SV is a special build for a partic 

* ular customer that needs special fixes or features.</br></br>EOE means 

*  that no new engineering fixes will be applied, but the SoftwareResour 

* ceSpecification can still be ordered. EOS means that the SoftwareResou 

* rceSpecificatino can no longer be ordered, but will still be supported 

* . EOL means that the SofwareResourceSpecification can no longer be sup 

* ported, and cannot be ordered.</br> 

*/
protected Integer releaseStatus ;




/**  
* Field buildNumber
* This is a string attribute that defines the internal identifier for th 

* e compilation of this unit of a SoftwareResourceSpecification. 

*/
protected String buildNumber ;




/**  
* Field minorVersion
* This a string attribute that defines the minor number component of the 

*  version of SoftwareResourceSpecification. For example, if the version 

*  is 3.1.10, the minor version is 1. 

*/
protected String minorVersion ;




/**  
* Field majorVersion
* This a string attribute that defines the major number component of the 

*  version of the SoftwareResourceSpecification. For example, if the ver 

* sion is 3.1.10, the major version is 3.</br></br></br> 

*/
protected String majorVersion ;




/**  
* Field isDistributable
* This is a Boolean attribute that, if TRUE, designates the SoftwareReso 

* urce as being able to be distributed across multiple physically distin 

* ct Resources. 

*/
protected Boolean isDistributable ;




/**  
* Field installSize
* The amount and units, such as 800 MB, required to install the Software 

* Resource. 

*/
protected Quantity installSize ;




/**  
* Field otherDesignator
* This is a string attribute, and enables the manufacturer to label this 

*  software as having some set of special restrictions (e.g., early or l 

* imited deployment, end of life, or targeted at a specific type of mark 

* et. 

*/
protected String otherDesignator ;




/**  
* Field maintenanceVersion
* This a string attribute that defines the maintenance number component  

* of the version of SoftwareResourceSpecification. For example, if the v 

* ersion is 3.1.10, the maintenance version is 10. 

*/
protected String maintenanceVersion ;




/**  
* Field isExperimental
* This is a Boolean attribute. If the value of this attribute is TRUE, t 

* hen this represents a special build (perhaps as a trial to suit specif 

* ic customer needs). 

*/
protected Boolean isExperimental ;




/**  
* Field softwareResourceSpecRelationship
*/
protected List<SoftwareResourceSpecRelationship> softwareResourceSpecRelationship ;




/**  
* Field softwareResourceSpecRelationship2
*/
protected List<SoftwareResourceSpecRelationship> softwareResourceSpecRelationship2 ;




/**  
* Field language
*/
protected List<Language> language ;


}