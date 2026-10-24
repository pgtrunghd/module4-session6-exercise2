# patient-service

Microservice quản lý bệnh nhân (port 8081), kết nối PostgreSQL `patient_db` và đăng ký vào Eureka Server (http://localhost:8761/eureka/).

- Chạy: `./gradlew bootRun` (cần tạo sẵn DB `patient_db` và chạy Eureka Server)
- API: `POST /api/v1/patients` với body `{"fullName": "...", "address": "...", "medicalHistory": "..."}`
