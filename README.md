CS-305: Software Security Portfolio
This repository contains security artifacts developed for Artemis Financial, focusing on vulnerability assessment and the implementation of secure software practices.
Reflection
1. Client Summary and Software Requirements
Artemis Financial is a financial consulting firm that develops individualized financial plans, including savings, retirement, and investments. As the company modernized its services with a RESTful API, they needed to address significant security gaps to protect sensitive client data. The primary issue was the need to transition from an insecure legacy state to a secure, modernized environment that ensures data integrity and confidentiality across international borders.


2. Vulnerability Assessment and the Value of Security
I successfully identified critical vulnerabilities through both manual code reviews and static testing. I performed well in uncovering hardcoded credentials, insecure encapsulation, and outdated third-party dependencies like the Spring Framework and Bouncy Castle. Coding securely is vital because it protects the foundation of client trust. For a company like Artemis Financial, software security prevents financial loss, identity theft, and regulatory penalties, directly contributing to the company's overall well-being and reputation.


3. Challenges and Helpful Insights
The manual review process was particularly helpful as it allowed me to see how small coding oversights, such as using e.printStackTrace(), can lead to significant information leakage. The most challenging part was interpreting the static testing reports to prioritize which vulnerabilities, such as Remote Code Execution (RCE), required immediate mitigation versus those that were less critical.


4. Increasing Security Layers and Future Tools
I increased security layers by implementing a "defense-in-depth" strategy, which included transitioning to HTTPS (TLS 1.3) for secure transit and implementing SHA-256 hashing for data integrity. In the future, I would use automated scanning tools connected to the National Vulnerability Database (NVD) API and CISA’s Known Exploited Vulnerability list to proactively assess threats and decide on mitigation techniques.

5. Ensuring Functionality and Security
To ensure the application remained functional after refactoring, I executed the code to verify that the SSL context initialized correctly and that the checksum was successfully generated. I checked for new vulnerabilities by performing secondary static testing using the OWASP Dependency-Check tool and running the Maven verify phase to confirm that no regression errors were introduced.

6. Resources and Tools for the Future
The most helpful resources I used were the OWASP Dependency-Check tool for supply-chain security and Java's MessageDigest class for implementing cryptographic hashes. Additionally, the practice of externalizing secrets rather than hardcoding them is a standard I will carry into all future coding tasks.

7. Showcasing Skills to Employers
From this assignment, I can show future employers my ability to conduct a comprehensive security audit and my technical proficiency in refactoring code to meet industry standards. Specifically, I can demonstrate my knowledge of cryptographic agility by implementing RSA 2048-bit keys and SHA-256 hashing to protect sensitive data.

