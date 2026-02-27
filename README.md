CS-305: Software Security (SNHU 2026)
This repository contains the technical implementations, security audits, and cryptographic solutions developed during the CS-305 Software Security course. The focus is on identifying vulnerabilities, implementing defensive coding practices, and ensuring data integrity and confidentiality.
🛠 Technical Roadmap & Deliverables
1. Vulnerability Assessment & Defensive Coding (Modules 2 & 4)
•	Buffer Overflow Mitigation: Implementing checks for memory bounds in C/C++.
•	Input Validation: Sanitizing user inputs to prevent SQL Injection and Cross-Site Scripting (XSS).
•	Memory Management: Utilizing secure pointers and preventing memory leaks.
2. Project One: Security Audit
•	Static Analysis: Performing code reviews to identify logic flaws and insecure API usage.
•	Reporting: Documenting vulnerabilities using industry-standard terminology (CVE/CWE).
3. Cryptography & Data Integrity (Module 5)
•	Checksum Verification: * Implementation of SHA-256/MD5 hashing to verify file integrity.
o	Comparison of calculated hashes against provided signatures.
•	Certificate Generation:
o	Creating Self-Signed Certificates using OpenSSL.
o	Implementing Public Key Infrastructure (PKI) concepts for secure communication.
4. Project Two: Secure System Design
•	Authentication & Authorization: Implementing Role-Based Access Control (RBAC).
•	Secure Communication: Transitioning from insecure protocols to TLS-encrypted channels.

📂 Repository Structure
Directory	Content	Key Technical Focus
/Module_Two_Coding	C++ Secure Coding	Buffer management and input hardening.
/Project_One	Security Audit	Vulnerability identification and risk assessment.
/Module_Five_Checksum	Integrity Scripts	SHA-256 verification tools.
/Module_Five_Certificates	SSL/TLS Config	Certificate Authority (CA) and X.509 certs.
/Project_Two	Final System	End-to-end secure software lifecycle.

🚀 Execution Instructions
Prerequisites
•	Compiler: GCC/G++ or Clang.
•	Tools: OpenSSL, GDB (for debugging buffer overflows), and Static Analysis tools (e.g., Cppcheck).
Running Checksum Verification
To verify the integrity of a software package:
Bash
# Generate SHA-256 hash
sha256sum filename.ext

# Compare with provided manifest
diff <(sha256sum filename.ext) <(cat manifest.sha256)
Generating RSA Keys
For secure identity management:
Bash
openssl genrsa -out private_key.pem 2048
openssl rsa -in private_key.pem -pubout -out public_key.pem

📑 Rubric Alignment
To ensure full marks, all code in this repository adheres to the following:
•	Functional Accuracy: Code must perform the security task (e.g., hash matches exactly).
•	Defensive Logic: Every user input is treated as untrusted.
•	Documentation: Clear comments explaining why a specific security library or function was chosen over an insecure alternative.

