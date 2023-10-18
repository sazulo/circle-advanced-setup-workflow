import { describe, it, expect } from "vitest"

describe("Sum", () => {
  describe("When executing 1 + 1", () => {
    it("Should return 2", () => {
      expect(1 + 1).toBe(2)
    })
  })

  describe("When executing 9 + 3", () => {
    it("Should return 12", () => {
      expect(9 + 3).toBe(12)
    })
  })
})
