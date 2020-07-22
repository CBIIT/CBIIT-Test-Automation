package com.nci.automation.common;

/**
 * Interface for objects that need to be saved as evidence
 */
public interface EvidenceReady
{
	String getFileNameForObject();
	
	String getFileContentsForObject();
}
