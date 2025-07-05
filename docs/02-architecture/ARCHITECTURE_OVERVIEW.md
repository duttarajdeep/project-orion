# 🏗️ Orion Architecture Overview

---

## 🔧 Monorepo Design (Spring Boot Modules)

- `gateway-service` — Main entrypoint for LLM tool calls
- `schema-generator` — Parses OpenAPI specs into structured function schemas
- `agent-core` — Agent execution engine (tool registry, plugin system)
- `auth-service` — Central auth (JWT, OAuth, RBAC)

---

## 🧱 Shared Libraries

- `commons` — DTOs, constants, errors
- `config-lib` — Spring config defaults, profiles
- `openai-sdk` — Wrapper for calling OpenAI, Claude, Gemini

---

## 🔄 Request Flow (LLM Tool Call)

1. User sends prompt via frontend → Orion gateway
2. Orion routes to matching agent/tool
3. If schema is missing → generate from OpenAPI
4. Call backend service → return result to LLM

---

## 🛡️ Security (Planned)

- API key auth + user-based JWTs
- Role-based access for multi-tenant setups
