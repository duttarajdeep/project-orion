# ⚙️ Tech Stack Decisions

---

## 🔥 Language: Java + Spring Boot

✅ Enterprise-grade  
✅ Strong typing, modularity, and observability  
✅ Aligns with long-term goal: SDE3/Staff readiness

---

## 🧩 Monorepo (vs Microservices)

**Why Monorepo?**
- Faster local dev + testing
- Easier module sharing (`shared/` libs)
- Service boundaries are still maintained logically

**Microservice Future-Readiness:**
- Each Spring Boot service is containerizable
- Can be split and deployed independently later

---

## 🛠️ Tools

| Category | Tools |
|---------|--------|
| Build | Gradle multi-module |
| Infra | Docker (later K8s) |
| CI/CD | GitHub Actions |
| LLMs | OpenAI, Claude, Gemini |
| DB | PostgreSQL (Supabase or local) |
