; 88 - Symmetric Difference

(defn sym-diff [s1 s2]
  (let [fs1 (filter #(nil? (s2 %)) s1)
        fs2 (filter #(nil? (s1 %)) s2)]
    (set (concat fs1 fs2))))


(= (sym-diff #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(= (sym-diff #{:a :b :c} #{}) #{:a :b :c})

(= (sym-diff #{} #{4 5 6}) #{4 5 6})

(= (sym-diff #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})
