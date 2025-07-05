# 🚀 Sprint 1 – Daily Plan

**Sprint Goal:**  
Set up the foundational services of the Orion platform, including `gateway-service` and `auth-service`, with shared infrastructure and basic JWT-based authentication.

---

## 📅 Duration
**Sprint Length:** 2 weeks (10 working days)  
**Sprint Type:** Feature + Infra Setup  
**Start Date:** [Insert Start Date]  
**End Date:** [Insert End Date]

---

## 🗓️ Day-wise Plan

| Day | Focus Area             | Tasks |
|-----|------------------------|-------|
| **Day 1** | Gateway Scaffold | - Create `gateway-service` module<br>- Add Spring Boot config<br>- Add `/health` endpoint<br>- Add dependency on `config-lib` |
| **Day 2** | Logging & CORS | - Add centralized logging filter<br>- Add global CORS configuration<br>- Add custom exception handler in `commons` |
| **Day 3** | Auth Service Scaffold | - Create `auth-service` module<br>- Add `/health` endpoint<br>- Add `User` DTO and controller skeleton |
| **Day 4** | Auth: JWT & Login | - Implement basic JWT service<br>- Add `/login` endpoint with hardcoded credentials<br>- Generate and return token |
| **Day 5** | Auth: Signup | - Implement `/signup` endpoint<br>- Use in-memory DB (H2) for storing users<br>- Validate duplicate emails |
| **Day 6** | JWT in Gateway | - Add filter to validate JWT in `gateway-service`<br>- Propagate user metadata to downstream services |
| **Day 7** | Gateway ↔ Auth Integration | - Wire up gateway routes to `auth-service`<br>- Add API response format<br>- Add Swagger |
| **Day 8** | Test Coverage | - Add unit tests for AuthService JWT logic<br>- Add integration test for `/health` and `/login` |
| **Day 9** | Docker + DB | - Add Dockerfile and docker-compose<br>- Switch AuthService to PostgreSQL<br>- Test full flow end-to-end |
| **Day 10** | Cleanup & Review | - Refactor DTOs / configs into `commons`<br>- Add README to each service<br>- Review, test and push final build |

---

## ✅ Deliverables by Sprint End

- `gateway-service` with `/health` and JWT filter
- `auth-service` with `/login` and `/signup`
- Shared logging, error handling, and CORS config
- JWT validation filter + gateway routing
- Basic test coverage
- Working local Docker setup with PostgreSQL