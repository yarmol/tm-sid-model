/**
* Management Job ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.u.e.s0N.u.tE.eGD0K.rE.cT.g.u.rQ-content.html">Management Job ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.management_job_business_entity ;

/**
* Defines the information required for a file based data transfer. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ProtocolTransferData" href="_Q.u.f6_.t.u.tE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ProtocolTransferData</a> @since SID_R16.5
*/ 

public  class FileTransferData extends ProtocolTransferData {



/**  
* Field fileLocation
* URI provided by the requesting OS indicating the rootname of the file( 

* s) to be produced and location of where to place the retrieved file(s) 

* .  

*/
protected URI fileLocation ;




/**  
* Field fileFormat
* Defines the format of the files. 

*/
protected String fileFormat ;




/**  
* Field compressionType
* The type of compression to apply to the generated file(s).</br></br>De 

* fault behavior (when request parameter is omitted) is NO_COMPRESSION.< 

* /br></br>Implementation of this file processing instruction by the Tar 

* get OS is optional, and any incompatible request shall be handled with 

*  the appropriate exception. Vendor extension of this attribute is perm 

* itted, the value EXTENSION is used to indicate it. 

*/
protected CompressionType compressionType ;




/**  
* Field retentionPeriod
* The maximum duration the files produced by this job will be retained o 

* n the producing OS.  

*/
protected Duration retentionPeriod ;




/**  
* Field packingType
* The type of packing to apply to all the file(s) generated from the sam 

* e request.</br></br>Default behavior (when request parameter is omitte 

* d) is NO_ PACKING.</br></br>Implementation of this file processing ins 

* truction by the Target OS is optional, and any incompatible request sh 

* all be handled with the appropriate exception. Vendor extension of thi 

* s attribute is permitted, the value EXTENSION is used to indicate it. 

*/
protected PackingType packingType ;


}