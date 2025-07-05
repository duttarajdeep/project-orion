# 🛰️ Project Orion

**Project Orion** is an AI-native infrastructure platform that connects LLMs (like ChatGPT, Claude, Gemini) with real-world APIs using a structured, scalable, and extensible server framework.

---

## 🎯 Goals

- Learn-by-doing approach to AI-based backend engineering
- Build modular, enterprise-grade MCP servers for LLM tools
- Gain system design, architecture, and delivery skills relevant to SDE3/Staff roles

---

## 🚀 Key Features

- Modular monorepo with Java + Spring Boot
- OpenAPI → LLM function schema generator
- Multi-agent plugin system (ChatGPT, Claude, Gemini)
- Pluggable enterprise tools: Auth, RBAC, Logging, Observability

---

## 🛠️ Tech Stack

| Layer | Tools |
|-------|-------|
| Language | Java 21 + Spring Boot 3.2+ |
| Monorepo | Gradle (multi-module) |
| Infra | Docker, GitHub Actions |
| Agents | OpenAI, Claude, Gemini |
| Frontend | Next.js (planned) |
| DB | PostgreSQL (via Supabase/Docker) |

---

## 📂 Structure (Monorepo)

| Layer | Tools |
|-------|-------|
| services/  | Core Spring Boot services (gateway, agents, auth) |
| shared/ | Reusable libraries (DTOs, config, LLM SDKs) |
| dashboard-ui/ | Frontend portal (Next.js; upcoming) |
| docs/ | All documentation and plans |
| infra/  | Docker, K8s, migrations |
| .github/ | CI/CD pipelines |


---

## 📌 Sprint Plan & Logs

- 📄 [Sprint Plan](docs/03-engineering/SPRINT_PLAN.md)
- 📝 [Daily Progress](docs/03-engineering/DAILY_PROGRESS_LOG.md)

